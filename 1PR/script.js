//GET
async function getAllData() {
    const url = "http://localhost:8080/o/headless-delivery/v1.0/sites/20117/blog-postings/"
      
    try {
      const response = await fetch(url, {
        method: "GET",
        headers: {
        "Content-Type": "application/json",
        Authorization: 'Basic ' + btoa('test@liferay.com:learn')
        } 
      });
      if (!response.ok) {
        throw new Error(`Response status: ${response.status}`)
      }
      const data = await response.json();
      console.log("Data received", data);
    } catch (error) {
      console.error(error.message);
    }
  }

let id;

  //POST
async function postData() {
    fetch("http://localhost:8080/o/headless-delivery/v1.0/sites/20117/blog-postings", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
            Authorization: 'Basic ' + btoa('test@liferay.com:learn')
        },
        body: JSON.stringify({
            articleBody: "This article was posted by Gabriel.R via REST services provided by Liferay DXP.",
            headline: "Test Blog Entry from REST Services"
        })
    })

        .then(res => {
            if(!res.ok) {
                return res.text().then(texto => {
                    throw new Error(`Error ${res.status}: ${texto}`);
                });
            }
            return res.json();
        }) 
        .then(data => {console.log("Post sucessfuly created", data);
        id = data.id;
        localStorage.setItem("postId", id);
        })
        .catch(err => console.error("Erro:", err.message))
}
//GETSINGLE

async function getSingleData() {
  
    const url = `http://localhost:8080/o/headless-delivery/v1.0/blog-postings/${id}`

    try {
        const res = await fetch(url, {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
                Authorization: 'Basic ' + btoa('test@liferay.com:learn')
            }
        });
        if (!res.ok) {
            throw new Error(`Response status: ${res.status}`)
        }
        const data = await res.json();
        console.log("Data received", data)
    } catch (error) {
        console.error(err.mensage)
    }
}

//DELETE
async function delPost() {

    const url = `http://localhost:8080/o/headless-delivery/v1.0/blog-postings/${id}`
      
    try {
      const response = await fetch(url, {
        method: "DELETE",
        headers: {
        "Content-Type": "application/json",
        Authorization: 'Basic ' + btoa('test@liferay.com:learn')
        } 
      });
      if (!response.ok) {
        throw new Error(`Response status: ${response.status}`)
      }
      console.log("Deleted successfuly")
    } catch (error) {
      console.error(error.message);
    }
  }