# Dessert Clicker

App created to learn about about the `lifecycle of an android activity`

## FutureMe Notes

- Android activities begin in the `onCreate()` method
- List of all activity lifecycle states (and their methods):
    - Created (`onCreate()`) -> initializes an activity
    - Initialized
    - Started (`onStart()`, `OnRestart()`)
    - Destroyed (`onDestroy()`)
    - Resumed (`onResume()`)
- the above states don't move in one predetermined single direction, they can move back and forth between each other
- every activity must implement the onCreate() method. It's where the activity is initialized
- setContent() in the onCreate() method specifies the activity's UI layout
- onCreate() is called only once; when the activity is initialized and created i.e OS creates the new Activity object in memory
- when overriding the activity states, you **must** call ***super.activityState*** inside the callback to complete the state override. Example:
  ```kotlin
     override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
     }
  ```
- `onStart(`) method runs after onCreate(); after the Activity has been initialized. It can be called as many times as possible in the lifecycle of the Activity
- After `onStart()` runs, the Activity becomes visible on the screen.
- if user switches from the app to another app or home screen, the `onStop()` method is called on the activity. `onStop()` stops the activity making it disappear from the screen
- `onStart()` runs after onCreate() and makes the Activity visible on the screen => displays the UI that had already been created in onCreate's setContent lambda
- `onStop()` makes the activity not visible on the screen.