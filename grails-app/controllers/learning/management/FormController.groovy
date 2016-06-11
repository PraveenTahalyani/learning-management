package learning.management

class FormController {

    def index() {}
    def saveuser(){
//        println"saveuser action executed"
//        println("parameters recieved")
//
//   redirect(controller:"form",action:"thankyou",params:[name:"you"])
         User u=new User(fn:params.firstName,ln:params.lastName,em:params.email,dob:params.DOB);
        u.myTask()

//   println params.firstName
//    println params.lastName
//        println params.email
//        println params.password
//        println params.DOB
        //return[firstName:params.firstName,lastName:params.lastName,Email:params.email,currentDate:new Date(),age:100,DOB:params.DOB]
        return [u1: u]
    }
    def thankyou()
    {
        render("thankyou very much")
    }
}
