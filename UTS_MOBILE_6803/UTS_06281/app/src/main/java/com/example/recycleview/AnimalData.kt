package com.example.recycleview

object AnimalData {
    private val animalname = arrayOf("Anjing",
        "Monyet",
        "Panda",
        "Tikus",
        "Ular")

    private val animaldetail = arrayOf("Anjing", "Monyet","Panda","Tikus","Ular")

    private val animalImages = intArrayOf(R.drawable.anjing,
        R.drawable.monyet,
        R.drawable.panda,
        R.drawable.tikus,
        R.drawable.ular)

    val listData: ArrayList<hewan>
        get() {
            val list = arrayListOf<hewan>()
            for (position in animalname.indices) {
                val hewan = hewan()
                hewan.name = animalname[position]
                hewan.detail = animaldetail[position]
                hewan.photo = animalImages[position]
                list.add(hewan)
            }
            return list
        }
}
