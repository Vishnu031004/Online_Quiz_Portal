document.getElementById("registerForm").addEventListener("submit", function(e) {
  e.preventDefault();
  const username = document.getElementById("regUsername").value;
  const password = document.getElementById("regPassword").value;

  if (localStorage.getItem(username)) {
    alert("Username already exists!");
    return;
  }

  const user = { username, password };
  localStorage.setItem(username, JSON.stringify(user));
  alert("Registered successfully!");
  window.location.href = "login.html";
});
