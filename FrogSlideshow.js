function updateSlide() {
    frogImage.style.opacity = 0; // Fade out
    setTimeout(() => {
        const data = frogData[currentIndex];
        console.log("Loading image:", data.src); // DEBUG
        frogImage.src = data.src;
        frogName.textContent = data.name;
        frogDescription.textContent = data.description;
        frogImage.style.opacity = 1; // Fade in
    }, 500);
}
