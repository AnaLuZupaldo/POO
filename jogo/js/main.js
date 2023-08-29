
function setup() {

    createCanvas(700, 400);
    
}
/* Na função de desenho definimos o que será exibido */
/* O image permite manipular o objeto no eixo x e y como também w e h  */
function draw() {
   
    background(imagemDaEstrada)
    showMascote()
    showCars()
    moveTheCars()
    walkMascote()
    incluirPontos()
    verCollide()

}
