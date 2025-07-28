document.getElementById("loginForm").addEventListener("submit", function(e) {
  e.preventDefault();
  const username = document.getElementById("username").value;
  const password = document.getElementById("password").value;
  
  const storedUser = localStorage.getItem(username);
  if (storedUser && JSON.parse(storedUser).password === password) {
    localStorage.setItem("currentUser", username);
    window.location.href = "dashboard.html";
  } else {
    alert("Invalid credentials!");
  }
});
