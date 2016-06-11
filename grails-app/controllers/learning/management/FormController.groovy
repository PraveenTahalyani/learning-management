package learning.management

class FormController {

    def index() {}
    def saveuser(){
        println"saveuser action executed"
        println("parameters recieved")
        redirect(controller:"form",action:"thankyou",params:[name:"you"])

    }
    def thankyou()
    {
        render("thankyou very much")
    }
}
