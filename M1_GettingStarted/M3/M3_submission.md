<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Jenish Patel (jp989)</td></tr>
<tr><td> <em>Generated: </em> 10/3/2023 5:48:03 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-001-F23/it114-number-guesser/grade/jp989" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><ol><li><a href="https://gist.github.com/MattToegel/aced06400c812f13ad030db9518b399f">https://gist.github.com/MattToegel/aced06400c812f13ad030db9518b399f</a><br></li></ol><li>Add/commit the files as-is from the lesson material (this is the base template)</li><li>Pick two (2) of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject user direct edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fjp989%2F2023-10-03T15.04.02Screenshot%202023-10-03%20110259.png.webp?alt=media&token=fed561f7-be58-4d96-8abc-baba198cf3c4"/></td></tr>
<tr><td> <em>Caption:</em> <p>Screenshot clearly shows the implementation working from running the program<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fjp989%2F2023-10-03T15.05.20Screenshot%202023-10-03%20110500.png.webp?alt=media&token=816bc836-146c-483f-b5a8-d1be6f3a3dd8"/></td></tr>
<tr><td> <em>Caption:</em> <p>The code screenshots contain the date/ucid/description comment<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fjp989%2F2023-10-03T20.35.16Screenshot%202023-10-03%20163500.png.webp?alt=media&token=99a39b21-1ae7-40fe-b6c6-0639d870eaa1"/></td></tr>
<tr><td> <em>Caption:</em> <p>Implement separate save files on a &quot;what&#39;s your name?&quot; prompt<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <div>This approach of saving user-specific data in separate files enhances data organization, simplifies<br>data retrieval, and facilitates scalability. It is a common practice in programming to<br>maintain individual user data efficiently while ensuring data privacy and security.<br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fjp989%2F2023-10-03T20.41.50Screenshot%202023-10-03%20164054.png.webp?alt=media&token=9f78eacb-c1a4-45f0-8c80-3f10cf6a8eec"/></td></tr>
<tr><td> <em>Caption:</em> <p>To implement separate save files for a &quot;What&#39;s your name?&quot; prompt, you create<br>a system that saves each user&#39;s name as a unique file, typically using<br>their input or a unique identifier as the filename. This allows for individualized<br>data storage and retrieval, ensuring accurate user-specific information management.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>When a user enters their name, the program generates a file with a<br>unique identifier, like the user&#39;s username or a timestamp, and saves their name<br>to that file. This approach ensures that each user&#39;s data is stored separately,<br>making it easy to retrieve and manage individual user information in the future.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/jp989njit/IT114-001/pull/3">https://github.com/jp989njit/IT114-001/pull/3</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>I learned FileWriter constructor with its functionality.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-001-F23/it114-number-guesser/grade/jp989" target="_blank">Grading</a></td></tr></table>