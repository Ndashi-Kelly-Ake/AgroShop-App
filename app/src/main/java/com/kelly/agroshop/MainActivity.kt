package com.kelly.agroshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cropAdapter: CropAdapter
    private lateinit var crops: List<Crop>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the crops list
        crops = listOf(
            Crop(
                "Maize",
                "https://example.com/maize.jpg",
                "Maize is a cereal grain that is widely grown in Africa.",
                listOf(
                    "Prepare the soil by tilling and adding organic matter.",
                    "Plant the maize seeds in rows.",
                    "Water the plants regularly.",
                    "Harvest the maize when the kernels are dry."
                )
            ),
            Crop(
                "Groundnut",
                "https://example.com/groundnut.jpg",
                "Groundnut is a legume that is grown for its edible seeds.",
                listOf(
                    "Choose a site with well-drained soil.",
                    "Plant the groundnut seeds in warm soil.",
                    "Water the plants regularly.",
                    "Harvest the groundnuts when the leaves have yellowed and the pods are dry."
                )
            ),
            Crop(
                "Pineapple",
                "https://example.com/pineapple.jpg",
                "Pineapple is a tropical fruit that is grown for its sweet flesh.",
                listOf(
                    "Choose a site with well-drained soil.",
                    "Plant the pineapple in a sunny location.",
                    "Water the plant regularly, but do not overwater.",
                    "Harvest the pineapple when the fruit is fully ripe."
                )
            ),
            Crop(
                "Cassava",
                "https://example.com/cassava.jpg",
                "Cassava is a root vegetable that is widely grown in Africa.",
                listOf(
                    "Choose a site with well-drained soil.",
                    "Plant the cassava cuttings in mounds.",
                    "Water the plants regularly.",
                    "Harvest the cassava when the leaves have yellowed and the roots are mature."
                )
            ),
            Crop(
                "Potatoes",
                "https://example.com/potatoes.jpg",
                "Potatoes are a staple crop that is grown worldwide.",
                listOf(
                    "Choose a site with well-drained soil.",
                    "Plant the potatoes in rows.",
                    "Hill up the soil around the plants as they grow.",
                    "Harvest the potatoes when the leaves have yellowed and the tubers are mature."
                )
            )
        )

        // Set up the RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        cropAdapter = CropAdapter(crops, object : CropAdapter.OnItemClickListener {
            override fun onItemClick(crop: Crop) {
                // Start the detail activity for the selected crop
                val intent = Intent(this@MainActivity, CropDetailActivity::class.java)
                intent.putExtra("crop", crop)
                startActivity(intent)
            }
        })
        recyclerView.adapter = cropAdapter
    }
}

class CropAdapter(private val crops: List<Crop>, private val listener: OnItemClickListener) :
    RecyclerView.Adapter<CropAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(crop: Crop)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.crop_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val crop = crops[position]
        holder.bind(crop)

        holder.itemView.setOnClickListener {
            listener.onItemClick(crop)
        }
    }

    override fun getItemCount(): Int = crops.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)

        fun bind(crop: Crop) {
            nameTextView.text = crop.name
            Glide.with(itemView.context).load(crop.imageUrl).into(imageView)
        }
    }
}

class CropDetailActivity : AppCompatActivity() {

    private lateinit var crop: Crop

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crop_detail)

        // Get the selected crop from the intent
        crop = intent.getParcelableExtra("crop")!!

        // Populate the UI with the crop details
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val imageView: ImageView = findViewById(R.id.imageView)
        val descriptionTextView: TextView = findViewById(R.id.descriptionTextView)
        val instructionsTextView: TextView = findViewById(R.id.instructionsTextView)

        nameTextView.text = crop.name
        Glide.with(this).load(crop.imageUrl).into(imageView)
        descriptionTextView.text = crop.description
        instructionsTextView.text = crop.instructions.joinToString("\n")
    }
}

data class Crop(
    val name: String,
    val imageUrl: String,
    val description: String,
    val instructions: List<String>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createStringArrayList()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(imageUrl)
        parcel.writeString(description)
        parcel.writeStringList(instructions)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Crop> {
        override fun createFromParcel(parcel: Parcel): Crop {
            return Crop(parcel)
        }

        override fun newArray(size: Int): Array<Crop?> {
            return arrayOfNulls(size)
        }
    }
}