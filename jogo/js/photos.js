/* Function seria como um método| ações dentro do JS */
/* Na função setup definimos as configurações de largura e altura  */
let imagemDaEstrada/* var = let para criar um variável */
let imagemDoMascote/* var = let para criar um variável */
let imageCar/* var = let para criar um variável */
let imageCar2
let imageCar3
let imageCars/* Criação de um arrays|vetor|lista de carros */
/* posições dos carros | para fazer o carro andar*/


function preload() {
    imagemDaEstrada = loadImage("img/sky.jpg")
    imagemDoMascote = loadImage("img/bird.png")
    imageCar = loadImage("img/cloud.png")
    imageCar2 = loadImage("img/clound2.png")
    imageCar3 = loadImage("img/cloud3.png")
    imageCars = [imageCar, imageCar2 , imageCar3, imageCar,imageCar2, imageCar3]
    
}
