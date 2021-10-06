package com.example.statementview

data class StatementModel(
    var id: String,
    var status: String,
    var bank: String = "Axis**1234",
    var price: String = "$2347",
    var date: String

)

fun prepareData(): ArrayList<StatementModel> {

    var list = ArrayList<StatementModel>()
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Payment failed", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Payment failed", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Payment failed", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Payment failed", date = "29 jun 2021,06:30"))
    list.add(StatementModel("#123456", status = "Processing", date = "29 jun 2021,06:30"))
    return list
}
