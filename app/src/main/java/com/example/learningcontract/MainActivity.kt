package com.example.learningcontract

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

data class LearningContract(
    val studentName: String,
    val courseSection: String,
    val date: String,
    val expectations: String,
    val motivations: String,
    val contributions: String,
    val hindrances: String,
    val signerName: String,
    val signatureResId: Int?
)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Keep system insets applied to the main screen layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // View References
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)
        val navView = findViewById<NavigationView>(R.id.navView)

        val tvStudentName = findViewById<TextView>(R.id.tvStudentName)
        val tvCourseSection = findViewById<TextView>(R.id.tvCourseSection)
        val tvDate = findViewById<TextView>(R.id.tvDate)
        val tvExpectations = findViewById<TextView>(R.id.tvExpectations)
        val tvMotivations = findViewById<TextView>(R.id.tvMotivations)
        val tvContributions = findViewById<TextView>(R.id.tvContributions)
        val tvHindrances = findViewById<TextView>(R.id.tvHindrances)
        val tvSignerName = findViewById<TextView>(R.id.tvSignerName)
        val ivSignature = findViewById<ImageView>(R.id.signatureImage)

        // All 4 Learning Contracts
        val contracts = mapOf(
            R.id.nav_contract_1 to LearningContract(
                studentName = "BARCARSE, Glexainth John D.",
                courseSection = "Course & Section: BSCS CITCS 3E - Group B",
                date = "Date: Sept. 12, 2026",
                expectations = "In this subject, I expect to learn how to turn an app idea into a working mobile application. I want to understand how to design clear screens and navigation that users can follow easily. I also expect to practice writing code, handling user input, and storing information. Through exercises and feedback, I hope to learn how to test features and identify errors. By the end of the course, I aim to build a simple app and explain the decisions behind its design and functions.",
                motivations = "I am motivated by the opportunity to create mobile applications that address everyday needs. As a Computer Science student, I want to apply my programming knowledge to projects that people can actually use. Developing a task organizer or reminder app would give me a practical starting point. I also want to become more confident in turning my ideas into clear designs and working features. Seeing my progress from an initial screen sketch to a functioning application will encourage me to keep practicing.",
                contributions = "I will take part in class discussions and share ideas that can help improve our app designs. During group projects, I will finish my tasks on time and keep my groupmates updated on my progress. I will also help test our app, clearly explain any problems I find, and consider suggestions from others. When sharing learning resources or using someone else's code or ideas, I will give proper credit to the source. If a task is unfamiliar to me, I will take time to learn how to do it and ask for help when needed.",
                hindrances = "I may need extra time to learn new development tools and figure out why my code is not working. Requirements from other subjects may also leave me with less time to practice building apps. Power outages and internet interruptions could make it difficult to work on my projects regularly. To manage these challenges, I will try to start early, break projects into smaller tasks, and keep backup copies of my files. I will also set aside time to practice and ask for help when I cannot solve a problem on my own.",
                signerName = "GLEXAINTH JOHN D. BARCARSE",
                signatureResId = R.drawable.sig_barcarse
            ),

            R.id.nav_contract_2 to LearningContract(
                studentName = "AGALOOS, Josh Jovian L.",
                courseSection = "Course & Section: CC17 3E - Group B",
                date = "Date: 09/10/26",
                expectations = "As a beginner in this course, I expect to grasp the core elements of designing and building mobile apps from the ground up. I anticipate learning how to craft clear, user-friendly layouts and buttons that feel natural on a smartphone screen. I also look forward to understanding how an app uses everyday features like the camera, basic location tracking, and simple touch gestures. Beyond that, I hope to discover how to store user information on a device and link my application to the internet for live data. Ultimately, my aim is to complete a working application by the end of the term and learn the basic steps to package and run it on a real phone.",
                motivations = "My main drive comes from the thrill of watching code I wrote run straight on my smartphone. I want to learn mobile development because phones are central to daily life, and this skill creates strong practical paths for my future career. I am also motivated by the creative freedom to shape my ideas into useful tools that friends, family, and classmates can use. Building an app offers an enjoyable, hands-on challenge where I can immediately see visual results each time I test a feature. Ultimately, I aim to gain the confidence to pursue my own projects and establish a firm, practical base for my remaining computer science studies.",
                contributions = "In our classroom, I will start by bringing an open mindset, active curiosity, and a readiness to join group discussions and hands-on lab work. I intend to work closely with classmates by sharing useful tips, shortcuts, or fixes I find during coding exercises. I also hope to offer practical project ideas aimed at resolving simple, everyday issues students face on campus. In addition, I will contribute clean, well-commented code so my partners can follow and expand my work easily. Finally, I will be a dependable teammate who meets deadlines and supports peers when we encounter common beginner bugs.",
                hindrances = "Since this is my first time studying mobile development, my most immediate challenge will be adjusting to unfamiliar software tools and new coding environments. I also fear that running demanding programs and phone simulators could strain my laptop and slow my progress. Designing screens that adapt smoothly to various phone sizes and orientations will probably involve trial and error. Moreover, learning how to keep an app from freezing or losing data during screen changes will be difficult at first. Finally, balancing time to fix unexpected errors while keeping pace with other subjects will demand patience and steady practice.",
                signerName = "JOSH JOVIAN L. AGALOOS",
                signatureResId = R.drawable.sig_agaloos
            ),

            R.id.nav_contract_3 to LearningContract(
                studentName = "OMADLAO, Zanya Reubenne D.",
                courseSection = "Course & Section: BSCS CITCS 3E - Group B",
                date = "Date: Sept. 12, 2026",
                expectations = "I expect this course to provide a clear understanding of the fundamental concepts and processes involved in mobile application development. I hope to learn how to design, develop, test, and improve mobile applications using appropriate programming tools and technologies. I also expect the course activities to provide practical experience rather than focusing only on theoretical concepts. I hope to develop applications that are functional, user-friendly, and relevant to real-world needs. Overall, I expect this course to strengthen my programming skills and give me a better foundation for developing mobile applications in the future.",
                motivations = "My main motivation for taking this course is to develop practical skills in creating mobile applications. I am interested in learning how applications are designed and developed because mobile technology is widely used in everyday life. I am also motivated to improve my programming and problem-solving skills through hands-on development activities. Learning to create a working application from an initial idea would give me a sense of accomplishment and encourage me to improve further. Ultimately, I hope the knowledge and experience gained from this course will be useful in my future academic and professional endeavors.",
                contributions = "I will contribute to the course by actively participating in discussions, activities, and practical exercises. I will share ideas and insights that may be useful during group discussions and collaborative activities. I will make an effort to complete programming tasks and requirements responsibly and within the given deadlines. I will also help maintain a positive learning environment by respecting the ideas and contributions of my classmates. Through consistent participation and effort, I hope to contribute meaningfully to the success of the course.",
                hindrances = "One possible hindrance to my online learning experience is maintaining a consistent schedule while managing requirements from other courses. Technical problems, such as unstable internet connections, software errors, or limited device performance, may also affect my ability to complete development activities smoothly. Some programming concepts may be challenging to understand, especially when developing applications that involve multiple components or unfamiliar tools. Debugging errors can also take considerable time and may become frustrating when the cause of a problem is difficult to identify. Despite these challenges, I intend to manage my time properly, seek assistance when necessary, and continue practicing.",
                signerName = "ZANYA REUBENNE D. OMADLAO",
                signatureResId = R.drawable.sig_omadlao
            ),

            R.id.nav_contract_4 to LearningContract(
                studentName = "PACIO, Ian Russel B.",
                courseSection = "Course & Section: CC17-3E",
                date = "Date: 12/09/26",
                expectations = "I expect to learn many useful things that I can use in the future. I think this course will be challenging but helpful for me. I want to gain new experiences and learn new skills. I also want to improve the skills I already have. I hope to have a kind and helpful instructor who will guide me.",
                motivations = "My family is my main motivation. I want to be successful in my future career. I want to finish my course and graduate. I hope to find a good job someday. I also want to achieve my dreams.",
                contributions = "I will do my best to listen and learn in class. I will follow instructions carefully. I will pass all my activities on time. I will try to avoid distractions while studying. I will do my best to overcome any problems I face.",
                hindrances = "Procrastination is one of my problems. I sometimes get distracted by video games and friends. Unexpected things like sickness or emergencies can happen. I also have trouble managing my time. The workload from other subjects can also be hard to handle.",
                signerName = "IAN RUSSEL B. PACIO",
                signatureResId = R.drawable.sig_pacio
            )
        )

        // Function to bind data to UI
        fun displayContract(contract: LearningContract) {
            tvStudentName.text = contract.studentName
            tvCourseSection.text = contract.courseSection
            tvDate.text = contract.date
            tvExpectations.text = contract.expectations
            tvMotivations.text = contract.motivations
            tvContributions.text = contract.contributions
            tvHindrances.text = contract.hindrances
            tvSignerName.text = contract.signerName

            if (contract.signatureResId != null) {
                ivSignature.setImageResource(contract.signatureResId)
                ivSignature.visibility = View.VISIBLE
            } else {
                ivSignature.visibility = View.GONE
            }
        }

        // Load Barcarse's contract initially
        contracts[R.id.nav_contract_1]?.let { displayContract(it) }

        // Click hamburger icon to open sidebar
        topAppBar.setNavigationOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // Drawer Item Selection Listener
        navView.setNavigationItemSelectedListener { menuItem ->
            contracts[menuItem.itemId]?.let { contract ->
                displayContract(contract)
                menuItem.isChecked = true
                drawerLayout.closeDrawer(GravityCompat.START)
                true
            } ?: false
        }
    }
}