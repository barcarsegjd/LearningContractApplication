# Learning Contract Application — CITCS 3E (Group B)

An Android application developed for CC17 (Mobile Application Development) that presents individual student learning contracts and digital signatures using a dynamic, single-activity architecture with a navigation drawer.

---

## 📱 Features

- **Collapsible Navigation Drawer:** Built with `DrawerLayout` and `NavigationView` to switch smoothly between student profiles[cite: 3].
- **Custom Branded Toolbar:** Styled with the department forest green theme (`#1B5E20`) and an embedded CITCS logo[cite: 1].
- **Dynamic Content Binding:** Single layout template dynamically populated via a Kotlin data model (`LearningContract`), avoiding duplicate screens.
- **Adaptive Signatures:** Displays handwritten signature assets when available and automatically hides the slot if no image is provided.
- **Scrollable Layout:** Responsive `ScrollView` container ensuring readability across various screen sizes and orientations.

---

## 👥 Group Members & Contributors

| Name | Program & Section |
| :--- | :--- |
| **Glexainth John D. Barcarse** | BSCS CITCS 3E - Group B |
| **Josh Jovian L. Agaloos** | CC17 3E - Group B |
| **Zanya Reubenne D. Omadlao** | BSCS CITCS 3E - Group B |
| **Ian Russel B. Pacio** | CC17-3E |

---

## 🛠️ Tech Stack & Environment

- **Language:** Kotlin
- **IDE:** Android Studio Ladybug / Koala
- **Target SDK:** Android 14.0 (API 34)
- **Minimum SDK:** API 24 (Android 7.0)
- **UI Architecture:** XML Layouts (`DrawerLayout`, `MaterialToolbar`, `ScrollView`, `LinearLayout`)
---

## 📂 Project Structure

```text
app/src/main/
├── java/com/example/learningcontract/
│   └── MainActivity.kt          # Navigation logic, data model, & dynamic UI rendering
└── res/
    ├── drawable/                # CITCS logo, menu icon, & member signatures
    ├── layout/
    │   ├── activity_main.xml    # Primary view with Toolbar & ScrollView
    │   └── nav_header.xml       # Drawer header banner
    └── menu/
        └── nav_menu.xml         # Sidebar menu entries
