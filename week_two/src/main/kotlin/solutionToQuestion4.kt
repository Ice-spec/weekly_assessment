//Class 1
class Profile {
    private var firstName: String = ""
    private var lastName: String = ""
    private var age: Int = 0
    private var address: String = ""
    private var email: String = ""

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    // Functions of setter and getters are declare below
    fun getFirstName(): String {
        return firstName
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAddress(): String {
        return address
    }

    fun setAddress(address: String) {
        this.address = address
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }
}

//Class 2
class AccountDetails {
    private var name_of_bank: String = ""
    private var accountName: String = ""
    private var BVN: Int = 0
    private var accountNumber: Int = 0
    private var account_balance: Double = 0.0

    constructor(BVN: Int, accountNumber: Int) {

        this.BVN = BVN
        this.accountNumber = accountNumber
    }

    // Functions of setter and getters are declare below
    fun getName_of_Bank(): String {
        return name_of_bank
    }

    fun setName_of_Bank(name_of_bank: String) {
        this.name_of_bank = name_of_bank
    }

    fun getAccountName(): String {
        return accountName
    }

    fun setAccountName(accountName: String) {
        this.accountName = accountName
    }

    fun getBvN(): Int {
        return BVN
    }

    fun setBvN(age: Int) {
        this.BVN = BVN
    }

    fun getAccountNumber(): Int {
        return accountNumber
    }

    fun setAccountNumber(accountNumber: Int) {
        this.accountNumber = accountNumber
    }

    fun getAccountBalance(): Double {
        return account_balance
    }

    fun setAccountBalance(account_balance: Double) {
        this.account_balance = account_balance
    }
}

//Class 3
class StudentDetails {
    private var studentName: String = ""
    private var courseStudied: String = ""
    private var year_graduated: Int = 0
    private var GradeObtained: String = ""
    private var name_of_school: String = ""

    constructor(studentName: String, courseStudied: String) {
        this.studentName = studentName
        this.courseStudied = courseStudied
    }

    // Functions of setter and getters are declare below
    fun getStudentName(): String {
        return studentName
    }

    fun setStudentName(studentName: String) {
        this.studentName = studentName
    }

    fun getCourseStudied(): String {
        return courseStudied
    }

    fun setCourseStudied(courseStudied: String) {
        this.courseStudied = courseStudied
    }

    fun getYearGraduated(): Int {
        return year_graduated
    }

    fun setYearGradueted(year_graduated: Int) {
        this.year_graduated = year_graduated
    }

    fun getGrade_Obtained(): String {
        return GradeObtained
    }

    fun setGrade_Obtained(GradeObtained: String) {
        this.GradeObtained = GradeObtained
    }

    fun gethNameOfSchool(): String {
        return name_of_school
    }

    fun setNameOfSchool(name_of_school: String) {
        this.name_of_school = name_of_school
    }
}

//Class 4
class Gadget {
    private var name: String = ""
    private var type: String = ""
    private var dateProduced: String = ""
    private var date_purchased: String = ""
    private var Warranty: String = ""

    constructor(name: String, type: String) {
        this.name = name
        this.type = type
    }

    // Functions of setter and getters are declare below
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getType(): String {
        return type
    }

    fun setType(type: String) {
        this.type = type
    }

    fun getDateProduced(): String {
        return dateProduced
    }

    fun setDateProduced(dateProduced: String) {
        this.dateProduced = dateProduced
    }

    fun getDatePurchased(): String {
        return date_purchased
    }

    fun setDatePurchased(date_purchased: String) {
        this.date_purchased = date_purchased
    }

    fun getWarranty(): String {
        return Warranty
    }

    fun setWarranty(emailWarranty: String) {
        this.Warranty = Warranty
    }
}

//Class 5
class Beverages {
    private var nameOfBeverage: String = " "
    private var productionDate: String = " "
    private var expiringDate: String = " "
    private var demand_rate: String = " "
    private var amountProduced: Int = 0

    constructor(nameOfBeverage: String, productionDate: String) {
        this.nameOfBeverage = nameOfBeverage
        this.productionDate = productionDate
    }

    // Functions of setter and getters are declare below
    fun getNameOfBeverage(): String {
        return nameOfBeverage
    }

    fun setNameofBeverage(nameOfBeverage: String) {
        this.nameOfBeverage = nameOfBeverage
    }

    fun getProductionDate(): String {
        return productionDate
    }

    fun setProductionDate(productionDate: String) {
        this.productionDate = productionDate
    }

    fun getExpiringDate(): String {
        return expiringDate
    }

    fun setExpiringDate(expiringDate: String) {
        this.expiringDate = expiringDate
    }

    fun getDemandRate(): String {
        return demand_rate
    }

    fun setDemandRate(demand_rate: String) {
        this.demand_rate = demand_rate
    }

    fun getAmountProduced(): Int {
        return amountProduced
    }

    fun setAmountProduced(amountProduced: Int) {
        this.amountProduced = amountProduced
    }
}
