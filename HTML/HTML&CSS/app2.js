let indice = 0;

function moverCarrusel(direccion) {
    const carrusel = document.querySelector(".carrusel-contenedor");
    const items = document.querySelectorAll(".carrusel-item");
    const total = items.length;

    indice += direccion;

    if (indice >= total) {
        indice = 0;
    } else if (indice < 0) {
        indice = total - 1;
    }

    const desplazamiento = -indice * 100 + "%";
    carrusel.style.transform = `translateX(${desplazamiento})`;
}
