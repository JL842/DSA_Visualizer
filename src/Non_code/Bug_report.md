
Bug 1, 03/03/2026:

When trying to change sceneRoot in the scene from another class e.g. BubbleSort_controller it 
didn't work because the FXMLoader could not find it, initially I thought it would start from 
src file then look there, but actually it starts from the current class, so I had to go up a 
directory (..) and then go to the fxml pages in view directory to find the fxml to load.