const user = localStorage.getItem("currentUser");
if (!user) {
  window.location.href = "login.html";
}

document.getElementById("userDisplay").innerText = user;

function logout() {
  localStorage.removeItem("currentUser");
  window.location.href = "index.html";
}
