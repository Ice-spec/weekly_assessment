fun main() {
    var profile: Profile = Profile("Gina", "Frank")
    profile.setAddress("8 kumuyi close")
    profile.setAge(45)
    profile.setEmail("Gina@gmail.com")

    var bank_details: AccountDetails = AccountDetails(22555588, 604252455)
    bank_details.setAccountName("Dennis James")
    bank_details.setAccountBalance(47582614.45785)
    bank_details.setName_of_Bank("Keystone")

    var studentDetail: StudentDetails = StudentDetails("Henry", "Computer Science")
    studentDetail.setGrade_Obtained("Upper Credit")
    studentDetail.setNameOfSchool("Novenna University")
    studentDetail.setYearGradueted(2016)

    var gadget: Gadget = Gadget("Infinix Xmax", "Mobile phone")
    gadget.setDateProduced("1/25/2015")
    gadget.setDatePurchased("25/8/2016")
    gadget.setWarranty("2 years")

    var beverages: Beverages = Beverages("Bonvita", "12/7/2020")
    beverages.setAmountProduced(4512)
    beverages.setDemandRate("100%")
    beverages.setExpiringDate("21/5/2021")
    beverages.setProductionDate("1/1/2021")
    // using getters to set
    println("${profile.getFirstName()}\n${profile.getLastName()}\n${profile.getAge()}")
    println()
    println("${bank_details.getAccountName()}\n${bank_details.getAccountNumber()}\n${bank_details.getAccountBalance()}")
    println()
    println("${studentDetail.getStudentName()}\n${studentDetail.getCourseStudied()}\n${studentDetail.getGrade_Obtained()}")
    println()
    println("${gadget.getName()}\n${gadget.getType()}\n${gadget.getWarranty()}")
    println()
    println("${beverages.getNameOfBeverage()}\n${beverages.getDemandRate()}/n${beverages.getProductionDate()}")
}