
let XCars =[600,600,600,600,600,600]
let YCars = [50,100,155,215,270,325]
let velocidadeCars = [5,5.2,5.6,5.1,4.2,5]
let WCars = 50
let HCars = 30

function showCars() {
    
    for (let i = 0; i < imageCars.length; i++) {
        image(imageCars[i],XCars[i],YCars[i],WCars,HCars)
        
    }


    /* 
    image(imageCar2,xcars2,94,45,40)
    image(imageCar3,xcars3,150,45,40) */
    
}

function moveTheCars() {
    for (let i = 0; i < imageCars.length; i++){
        XCars[i]-= velocidadeCars[i]
      
          if (XCars[i] < -50) {
            XCars[i] = 700
            
        }
    }

     
 }
 