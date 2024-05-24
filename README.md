# Dessert Clicker

App created to learn about about the `lifecycle of an android activity`

![dessert-clicker](https://github.com/2Kelvin/dessert-clicker/assets/85868026/40fff5e8-4031-4281-a4ff-f7acec690013)

## FutureMe Notes

- Android activities begin in the `onCreate()` method
- List of all activity lifecycle states (and their methods):
    - **Created** (`onCreate()`) -> initializes an activity
    - **Initialized**
    - **Started** (`onStart()`, `OnRestart()`) -> onStart displays UI to screen, onRestart re-displays UI after it had been made non-visible by `onStop()`
    - **Destroyed** (`onDestroy()`) -> destroys Activity & gives back resources used to android OS
    - **Resumed** (`onResume()`) -> gives the activity, user interaction focus; `onPause(`) takes away user interaction focus
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
- `onResume()` runs after onStart(), it makes the app able to receive interaction input from the user
- `onDestroy()` is also called once in the lifecycle of an activity. It destroy's all activity objects to give the resources it was using back to the Android OS to be used by other open apps
- in `onPause()` state, the app no longer has user focus and user cannot interacted with it...sometimes when the activity is in the background, in the recent apps page after opening another app...sometimes it's visible but there's another active activity on top of it with the user interaction active. Code in onPause() method should be lightweight as it can block other other activities from displaying. e.g. you could specify to delsy an incoming phone call in the onPause code block
- `onRestart()` is called when returning to an app that had been created then stopped but not destroyed yet. It retrieves the data that was before the app was stopped / pushed to the background
- `onDestroy()` is called to destroy an activity. onStop is called right before onDestroy is called
- device configuration changes can cause an activity to be destroyed and recreated again to accommodate the new changes. Examples of such configuration changes are: phone rotation, system language settings change etc
- unlike `remember` which triggers recomposition when state changes, `rememberSaveable` triggers recomposition on state change and retains the current state after a device configuration changes