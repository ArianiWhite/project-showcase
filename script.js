document.addEventListener("DOMContentLoaded", function() {
const quotes = [
  "The best way to predict the future is to invent it.",
  "Life is 10% what happens to us and 90% how we react to it.",
  "Your time is limited, don't waste it living someone else's life.",
  "Be the change you wish to see in the world.",
  "Success is not the key to happiness. Happiness is the key to success."
  ];

const generateBtn = document.getElementById("generate-btn");
const quoteDisplay = document.getElementById("quote");

generateBtn.addEventListener("click", function() {
  const randomIndex = Math.floor(Math.random() * quotes.length);
  quoteDisplay.textContent = quotes[randomIndex];
   
});
});