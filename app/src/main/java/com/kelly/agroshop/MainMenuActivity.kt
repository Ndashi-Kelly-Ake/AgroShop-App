package com.kelly.agroshop

class MainMenuActivity : AppCompatActivity() {
    // Code for the main menu activity goes here
}
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main_menu)
    // Define variables or objects here
}
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main_menu)

    // Set up a listener for the "Maize" button
    val maizeBtn: Button = findViewById(R.id.maize_button)
    maizeBtn.setOnClickListener {
        // Code to move to the MaizeActivity goes here
    }

    // Set up a listener for the "Potatoes" button
    val potatoesBtn: Button = findViewById(R.id.potatoes_button)
    potatoesBtn.setOnClickListener {
        // Code to move to the PotatoesActivity goes here
    }

    // Set up a listener for the "Pineapples" button
    val pineapplesBtn: Button = findViewById(R.id.pineapples_button)
    pineapplesBtn.setOnClickListener {
        // Code to move to the PineapplesActivity goes here
    }

    // Set up a listener for the "Groundnuts" button
    val groundnutsBtn: Button = findViewById(R.id.groundnuts_button)
    groundnutsBtn.setOnClickListener {
        // Code to move to the GroundnutsActivity goes here
    }
}
val maizeBtn: Button = findViewById(R.id.maize_button)
maizeBtn.setOnClickListener {
    val intent = Intent(this, MaizeActivity::class.java)
    startActivity(intent)
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
class MaizeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize UI components and handle user interactions
    }
}
class GroundnutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize UI components and handle user interactions
    }
}
class PineappleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize UI components and handle user interactions
    }
}
class CassavaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize UI components and handle user interactions
    }
}
class PotatoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize UI components and handle user interactions
    }
}

<com.google.android.exoplayer2.ui.PlayerView
android:id="@+id/player_view"
android:layout_width="match_parent"
android:layout_height="wrap_content"
app:resize_mode="fit"
app:controller_layout_id="@layout/custom_playback_controls" />

class MaizeActivity : AppCompatActivity() {

    private lateinit var playerView: PlayerView
    private lateinit var player: SimpleExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        playerView = findViewById(R.id.player_view)
        player = SimpleExoPlayer.Builder(this).build()
        playerView.player = player

        val mediaSource = buildMediaSource(Uri.parse("https://example.com/maize_tutorial.mp4"))
        player.setMediaSource(mediaSource)
        player.prepare()
    }

    private fun buildMediaSource(uri: Uri): MediaSource {
        val userAgent = Util.getUserAgent(this, "AgroShop")
        return ProgressiveMediaSource.Factory(DefaultDataSourceFactory(this, userAgent)).createMediaSource(uri)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}
class GroundnutActivity : AppCompatActivity() {

    private lateinit var playerView: PlayerView
    private lateinit var player: SimpleExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        playerView = findViewById(R.id.player_view)
        player = SimpleExoPlayer.Builder(this).build()
        playerView.player = player

        val mediaSource = buildMediaSource(Uri.parse("https://example.com/maize_tutorial.mp4"))
        player.setMediaSource(mediaSource)
        player.prepare()
    }

    private fun buildMediaSource(uri: Uri): MediaSource {
        val userAgent = Util.getUserAgent(this, "AgroShop")
        return ProgressiveMediaSource.Factory(DefaultDataSourceFactory(this, userAgent)).createMediaSource(uri)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}
class PineappleActivity : AppCompatActivity() {

    private lateinit var playerView: PlayerView
    private lateinit var player: SimpleExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        playerView = findViewById(R.id.player_view)
        player = SimpleExoPlayer.Builder(this).build()
        playerView.player = player

        val mediaSource = buildMediaSource(Uri.parse("https://example.com/maize_tutorial.mp4"))
        player.setMediaSource(mediaSource)
        player.prepare()
    }

    private fun buildMediaSource(uri: Uri): MediaSource {
        val userAgent = Util.getUserAgent(this, "AgroShop")
        return ProgressiveMediaSource.Factory(DefaultDataSourceFactory(this, userAgent)).createMediaSource(uri)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}
class CassavaActivity : AppCompatActivity() {

    private lateinit var playerView: PlayerView
    private lateinit var player: SimpleExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        playerView = findViewById(R.id.player_view)
        player = SimpleExoPlayer.Builder(this).build()
        playerView.player = player

        val mediaSource = buildMediaSource(Uri.parse("https://example.com/maize_tutorial.mp4"))
        player.setMediaSource(mediaSource)
        player.prepare()
    }

    private fun buildMediaSource(uri: Uri): MediaSource {
        val userAgent = Util.getUserAgent(this, "AgroShop")
        return ProgressiveMediaSource.Factory(DefaultDataSourceFactory(this, userAgent)).createMediaSource(uri)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}
class PotatoesActivity : AppCompatActivity() {

    private lateinit var playerView: PlayerView
    private lateinit var player: SimpleExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        playerView = findViewById(R.id.player_view)
        player = SimpleExoPlayer.Builder(this).build()
        playerView.player = player

        val mediaSource = buildMediaSource(Uri.parse("https://example.com/maize_tutorial.mp4"))
        player.setMediaSource(mediaSource)
        player.prepare()
    }

    private fun buildMediaSource(uri: Uri): MediaSource {
        val userAgent = Util.getUserAgent(this, "AgroShop")
        return ProgressiveMediaSource.Factory(DefaultDataSourceFactory(this, userAgent)).createMediaSource(uri)
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}
class MaizeActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var tutorialRef: CollectionReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        db = FirebaseFirestore.getInstance()
        tutorialRef = db.collection("maize_tutorials")
    }

    // Add code to retrieve and display tutorial content from Firestore
}
tutorialRef.whereEqualTo("topic", "Planting").whereEqualTo("level", "Beginner")
class TutorialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
    var descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)

    fun bind(tutorial: Tutorial) {
        titleTextView.text = tutorial.title
        descriptionTextView.text = tutorial.description
    }
}

class TutorialAdapter(options: FirestoreRecyclerOptions<Tutorial>) :
    FirestoreRecyclerAdapter<Tutorial, TutorialViewHolder>(options) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tutorial_item, parent, false)
        return TutorialViewHolder(view)
    }

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int, model: Tutorial) {
        holder.bind(model)
    }
}
class GroundnutActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var tutorialRef: CollectionReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        db = FirebaseFirestore.getInstance()
        tutorialRef = db.collection("maize_tutorials")
    }
}
// Add code to retrieve and display tutorial content from Firestore
class TutorialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
    var descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)

    fun bind(tutorial: Tutorial) {
        titleTextView.text = tutorial.title
        descriptionTextView.text = tutorial.description
    }
}

class TutorialAdapter(options: FirestoreRecyclerOptions<Tutorial>) :
    FirestoreRecyclerAdapter<Tutorial, TutorialViewHolder>(options) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tutorial_item, parent, false)
        return TutorialViewHolder(view)
    }

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int, model: Tutorial) {
        holder.bind(model)
    }
}
class PineappleActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var tutorialRef: CollectionReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        db = FirebaseFirestore.getInstance()
        tutorialRef = db.collection("maize_tutorials")
    }

    // Add code to retrieve and display tutorial content from Firestore
}
class TutorialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
    var descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)

    fun bind(tutorial: Tutorial) {
        titleTextView.text = tutorial.title
        descriptionTextView.text = tutorial.description
    }
}

class TutorialAdapter(options: FirestoreRecyclerOptions<Tutorial>) :
    FirestoreRecyclerAdapter<Tutorial, TutorialViewHolder>(options) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tutorial_item, parent, false)
        return TutorialViewHolder(view)
    }

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int, model: Tutorial) {
        holder.bind(model)
    }
}
class CassavaActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var tutorialRef: CollectionReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        db = FirebaseFirestore.getInstance()
        tutorialRef = db.collection("maize_tutorials")
    }
}
// Add code to retrieve and display tutorial content from Firestore
class TutorialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
    var descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)

    fun bind(tutorial: Tutorial) {
        titleTextView.text = tutorial.title
        descriptionTextView.text = tutorial.description
    }
}

class TutorialAdapter(options: FirestoreRecyclerOptions<Tutorial>) :
    FirestoreRecyclerAdapter<Tutorial, TutorialViewHolder>(options) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tutorial_item, parent, false)
        return TutorialViewHolder(view)
    }

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int, model: Tutorial) {
        holder.bind(model)
    }
}
class PotatoesActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var tutorialRef: CollectionReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        db = FirebaseFirestore.getInstance()
        tutorialRef = db.collection("maize_tutorials")
    }
}
// Add code to retrieve and display tutorial content from Firestore
class TutorialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var titleTextView: TextView = itemView.findViewById(R.id.title_text_view)
    var descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)

    fun bind(tutorial: Tutorial) {
        titleTextView.text = tutorial.title
        descriptionTextView.text = tutorial.description
    }
}

class TutorialAdapter(options: FirestoreRecyclerOptions<Tutorial>) :
    FirestoreRecyclerAdapter<Tutorial, TutorialViewHolder>(options) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tutorial_item, parent, false)
        return TutorialViewHolder(view)
    }

    override fun onBindViewHolder(holder: TutorialViewHolder, position: Int, model: Tutorial) {
        holder.bind(model)
    }
}
<SearchView
android:id="@+id/search_view"
android:layout_width="match_parent"
android:layout_height="wrap_content"
app:queryHint="Search tutorials..." />

class MaizeActivity : AppCompatActivity() {

    private lateinit var tutorialAdapter: TutorialAdapter
    private lateinit var queryTextListener: SearchView.OnQueryTextListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize tutorial adapter and set up RecyclerView
        val query = tutorialRef.orderBy("title")
        val options = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(query, Tutorial::class.java).build()
        tutorialAdapter = TutorialAdapter(options)
        tutorialRecyclerView.layoutManager = LinearLayoutManager(this)
        tutorialRecyclerView.adapter = tutorialAdapter

        // Set up search bar listener
        queryTextListener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                tutorialAdapter.stopListening()
                val newQuery = tutorialRef.orderBy("title").startAt(newText).endAt(newText + "\uf8ff")
                val newOptions = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(newQuery, Tutorial::class.java).build()
                tutorialAdapter.updateOptions(newOptions)
                tutorialAdapter.startListening()
                return true
            }
        }
        searchView.setOnQueryTextListener(queryTextListener)
    }

    // Add code to stop and start the tutorial adapter when the activity is paused and resumed
}
class GroundnutActivity : AppCompatActivity() {

    private lateinit var tutorialAdapter: TutorialAdapter
    private lateinit var queryTextListener: SearchView.OnQueryTextListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize tutorial adapter and set up RecyclerView
        val query = tutorialRef.orderBy("title")
        val options = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(query, Tutorial::class.java).build()
        tutorialAdapter = TutorialAdapter(options)
        tutorialRecyclerView.layoutManager = LinearLayoutManager(this)
        tutorialRecyclerView.adapter = tutorialAdapter

        // Set up search bar listener
        queryTextListener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                tutorialAdapter.stopListening()
                val newQuery = tutorialRef.orderBy("title").startAt(newText).endAt(newText + "\uf8ff")
                val newOptions = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(newQuery, Tutorial::class.java).build()
                tutorialAdapter.updateOptions(newOptions)
                tutorialAdapter.startListening()
                return true
            }
        }
        searchView.setOnQueryTextListener(queryTextListener)
    }

    // Add code to stop and start the tutorial adapter when the activity is paused and resumed
}
class PineappleActivity : AppCompatActivity() {

    private lateinit var tutorialAdapter: TutorialAdapter
    private lateinit var queryTextListener: SearchView.OnQueryTextListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize tutorial adapter and set up RecyclerView
        val query = tutorialRef.orderBy("title")
        val options = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(query, Tutorial::class.java).build()
        tutorialAdapter = TutorialAdapter(options)
        tutorialRecyclerView.layoutManager = LinearLayoutManager(this)
        tutorialRecyclerView.adapter = tutorialAdapter

        // Set up search bar listener
        queryTextListener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                tutorialAdapter.stopListening()
                val newQuery = tutorialRef.orderBy("title").startAt(newText).endAt(newText + "\uf8ff")
                val newOptions = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(newQuery, Tutorial::class.java).build()
                tutorialAdapter.updateOptions(newOptions)
                tutorialAdapter.startListening()
                return true
            }
        }
        searchView.setOnQueryTextListener(queryTextListener)
    }

    // Add code to stop and start the tutorial adapter when the activity is paused and resumed
}
class CassavaActivity : AppCompatActivity() {

    private lateinit var tutorialAdapter: TutorialAdapter
    private lateinit var queryTextListener: SearchView.OnQueryTextListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize tutorial adapter and set up RecyclerView
        val query = tutorialRef.orderBy("title")
        val options = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(query, Tutorial::class.java).build()
        tutorialAdapter = TutorialAdapter(options)
        tutorialRecyclerView.layoutManager = LinearLayoutManager(this)
        tutorialRecyclerView.adapter = tutorialAdapter

        // Set up search bar listener
        queryTextListener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                tutorialAdapter.stopListening()
                val newQuery = tutorialRef.orderBy("title").startAt(newText).endAt(newText + "\uf8ff")
                val newOptions = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(newQuery, Tutorial::class.java).build()
                tutorialAdapter.updateOptions(newOptions)
                tutorialAdapter.startListening()
                return true
            }
        }
        searchView.setOnQueryTextListener(queryTextListener)
    }

    // Add code to stop and start the tutorial adapter when the activity is paused and resumed
}
class PotatoesActivity : AppCompatActivity() {

    private lateinit var tutorialAdapter: TutorialAdapter
    private lateinit var queryTextListener: SearchView.OnQueryTextListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maize_activity)

        // Initialize tutorial adapter and set up RecyclerView
        val query = tutorialRef.orderBy("title")
        val options = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(query, Tutorial::class.java).build()
        tutorialAdapter = TutorialAdapter(options)
        tutorialRecyclerView.layoutManager = LinearLayoutManager(this)
        tutorialRecyclerView.adapter = tutorialAdapter

        // Set up search bar listener
        queryTextListener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                tutorialAdapter.stopListening()
                val newQuery = tutorialRef.orderBy("title").startAt(newText).endAt(newText + "\uf8ff")
                val newOptions = FirestoreRecyclerOptions.Builder<Tutorial>().setQuery(newQuery, Tutorial::class.java).build()
                tutorialAdapter.updateOptions(newOptions)
                tutorialAdapter.startListening()
                return true
            }
        }
        searchView.setOnQueryTextListener(queryTextListener)
    }

    // Add code to stop and start the tutorial adapter when the activity is paused and resumed
}
val feedbackDialog = MaterialDialog(this)
    .title(R.string.feedback_dialog_title)
    .message(R.string.feedback_dialog_message)
    .positiveButton(R.string.feedback_dialog_submit) {
        // Submit feedback to the database
    }
    .negativeButton(R.string.feedback_dialog_cancel)
feedbackDialog.show()

@Entity
data class TutorialFeedback(
    @PrimaryKey val id: Int,
    val tutorialId: Int,
    val rating: Int,
    val comments: String
)

@Dao
interface TutorialFeedbackDao {
    @Query("SELECT * FROM TutorialFeedback WHERE tutorialId = :id")
    fun getFeedbackForTutorial(id: Int): List<TutorialFeedback>

    @Insert
    fun insertFeedback(feedback: TutorialFeedback)
}

@Database(entities = [TutorialFeedback::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tutorialFeedbackDao(): TutorialFeedbackDao
}

dependencies {
    // FCM dependencies
    implementation 'com.google.firebase:firebase-messaging:21.0.1'
}

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        // Handle incoming push notification
    }
}



