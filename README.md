# PersonalDetailsHNGxInternship
This is a two activity application that displays my details, name and image, and has a button for navigating to this repository.
The first activity is the home activity that displays the personal details and the second activity holds the webview that displays the github repository.
The application is made of four views:The TextView to display my slack name, a cardView to for a corner radius property so that the image can be round and good looking, 
an ImageView to hold my imbuttonView to for the github repository link and a webView to open a default browser to host the view for the github repository for the application when the button is clicked.
The application uses viewbinding instead of the legacy findViewById to avoid boilerpplate code.
The onbackPress function had been included in the application to avoid the exit of the application when the back button is pressed. This gives a good user experience.
