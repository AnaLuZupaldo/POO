//Variáveis do mascote e sobre a sua posição 

let yMascote = 350
let XMascote = 70
let meusPontos = 0

//variável para criação do collide do mascote e do carro
let collide = false

function incluirPontos() {
    text(meusPontos, 20,25)
    fill(color(0,0,128))
    textSize(21)
    if (yMascote < 0) {
        yMascote = 350
        meusPontos++
        
    }
   
    
}
//Se o cenário do jog é um looping eu tenho que ter em mente que todas as ações vão ter influencia desse looping
function verCollide() {

    for (let i = 0; i < imageCars.length; i++) {

      collide = collideRectCircle(XCars[i],YCars[i],WCars,HCars,XMascote,yMascote,15)
        if (collide) {
           yMascote = 350
               if (meusPontos > 0) {
                   meusPontos-=1
              
            }
          
        }
      
    }
    
    print('Colisão acontecendo', collide)
    // Quando a colisão acontece o valor boolean se torna true, quando o collide não acontece o valor é false
    
}


function showMascote() {
    image(imagemDoMascote,XMascote,yMascote,40,40)
}
function walkMascote() {
   

    if (keyIsDown(UP_ARROW)) {
      yMascote -=5
      
    }
    if (keyIsDown(DOWN_ARROW)){
      yMascote +=5
    }
    if (keyIsDown(RIGHT_ARROW)){
      XMascote +=5
    }
    if (keyIsDown(LEFT_ARROW)){
      XMascote -=5
    }
    
    }
  
  /* Sempre que houver uma interação com o usuário terá uma condition */