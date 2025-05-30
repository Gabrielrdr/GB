//Post a file in docs

async function postDocs() {
    const fileInput = document.getElementById("fileInput");
    const file = fileInput.files[0];

    if (!file) {
        alert("Select a file:");
        return;
    }

    const formData = new FormData();
    formData.append("file", file)

 fetch("http://localhost:8080/o/headless-delivery/v1.0/sites/20117/documents", {
    method: "POST",
    headers: {
        Authorization: "Basic " + btoa("test@liferay.com:learn")
    },
    body: formData,
 })
 .then((res) => {
    if (res.ok) {
        alert("Uploaded successfully");
    } else {
        alert("Failed")
    }
 })
 .catch((err) => {console.error("Error:", err);
    alert("Be careful there was an error");
 })
}