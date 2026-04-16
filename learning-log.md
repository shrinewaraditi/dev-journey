#  My Dev Journey
## Day 7 — April 16, 2026
### Quote
> *"Consistency is what transforms average into excellence."*

### What I Did
- Solved Move Zeroes on LeetCode ✅
- Learned enhanced for loop for printing arrays
- Understood two pointer / insert position pattern

### What Clicked
Instead of creating new array just track where
next non-zero element should go using insertPos.
Then fill rest with zeroes. Clean and simple.

### Honest Reflection
Short day — 30-40 min only but showed up anyway.
Array problems mostly need one pointer or two pointers.
That pattern is becoming clearer slowly.

### Mood
Short but solid. Showing up on busy days
matters more than perfect days.

---

## Day 6 — April 15, 2026
### Quote
> *"You don't have to be great to start,
>  but you have to start to be great."*

### What I Did
- Performed internship tasks in Java ✅
- Pushed internship work to GitHub ✅
- Revised Java basics for college viva
- Learned and revised OOP concepts —
  class, object, encapsulation, inheritance,
  polymorphism, abstraction

### What Actually Clicked
Internship code was in Java and pushing it to
GitHub felt different from pushing practice code.
That was real work on a real repo.
Also static keyword finally made sense —
it belongs to class not to any object.
That one line cleared weeks of confusion.

### Honest Confession
Did not complete planned DSA and HTML tasks.
College viva preparation took priority.
That was the right call for that day.
Learning is not always from a planned task —
revising Java for viva taught real concepts too.

### Pending Carried Forward
- HTML — nav fix, image, form still remaining
- Maximum Subarray still not submitted
- Move Zeroes pending → done today ✅

### Mood
Busy day but productive in a different way.
Internship + viva prep + GitHub push —
that is a full day even without planned tasks.

---
## Day 5 — April 14, 2026
### Quote
> *"Do what you can, with what you have, where you are."*

### What I Did
- Contains Duplicate accepted on LeetCode 
- Ran solution in VS Code terminal as well
- Understood HashSet theory properly
- Read HTML theory and made notes
- Took HTML self test — found where I lack

### What Actually Clicked
HashSet finally made sense today.
It is just a set of unique values nothing more.
If I add same value twice it just ignores it silently.
That is why it is perfect for duplicate checking.

### Honest Confession
Taking more days on HTML than planned.
But rushing it will only create weak foundation.
Going at my own speed and that is okay.
Notes are made, concepts are clear now.
Better slow and solid than fast and shaky.

### Where I Lack in HTML
forms and tables
also sometimes i mess up how to add link or add image in html page

### Pending
- HTML page — nav fix, image, form still remaining also tables 

### Tomorrow
- Fix HTML page pending tasks
- New LeetCode problem

### Mood
Feeling that something is being acheived but it also feels that space is slow .
but improving consistentaly.

---
## Day 4 — April 13, 2026

### Quote
> *"Small steps every day beat big steps someday."*

### What I Did
- Day 3 Stock problem accepted on LeetCode 
- Added main method to Day 3 solution independently
- Watched one HTML basics video — got started

### Honest Reflection
Three LeetCode problems accepted in first four days.
Starting to understand the pattern of adding main method
without being told exactly what to write.
HTML video watched — slow start but started.

### Pending — Tomorrow Priority
- Read HTML theory notes and make notes
- Fix nav, add image, add form to HTML page

### Mood
Tired. But three accepted solutions in four days.
That counts for something. Sleeping without guilt.

---
## Day 3 — April 12, 2026

### Quote
> *"Progress is progress, no matter how small."*

### What I Did
- Revised Day 1 and Day 2 LeetCode problems — Two Sum and Valid Parentheses
- Thought through the Stock problem approach on my own
- Identified the exact logical gap myself — global min and max don't work
  because max must come AFTER min in the array
- correct approach is to — track minPrice as you go and
  calculate profit at each step 
  - Learned how to add main method to any solution for VS Code
  - Fixed class name and file name mismatch in Java files

### What Actually Clicked
The buy before sell rule completely changes the approach.
Can't just find the smallest and largest number in array.
The minimum must always come before the maximum index wise.
Tracking minPrice so far at each step automatically handles this.
That was the real insight today.
Also understood that LeetCode runs code automatically but
VS Code needs main as entry point — like a front door.

### Honest Reflection
Didn't touch HTML or VS Code.
But didn't sleep without doing anything either.
Sat with the stock problem, thought it through,
found my own gap and understood why.
Some days thinking counts more than typing.
End of day fixed Java setup issues and understood

### What Is Pending — Carry Forward to Tomorrow
- Fix nav anchor links in HTML page
- Add image and contact form to HTML page
- Fix Java file name to match class name
- Submit day 3 problem  on LeetCode

### Tomorrow
Clear all pending tasks first — then move forward.
No new topics until pending is done.

### Mood
Showed up even on a bad day.
That is the habit being built.

---
## Day 2 — April 11, 2026

### What I Did
- Solved Valid Parentheses on LeetCode question 20 — got accepted
- Understood why Stack is the right tool for bracket matching 
- Set up Live Server properly
- Built my first HTML page and actually saw it in the browser
- Learned what semantic tags are and why they matter

### What I Learned Today
difference between `stack.peek()` and `stack.pop()`
Also the moment my page opened in the browser felt real.
Like okay this is actually working.

### Honest Confession
Didn't fully get why each word in html skeleton is written but i know it will have immense meaning so i will learn about it later.
Right now i am mostly using brute force and help of AI to solve problems. But solving a problem is itself big acheivement for me now.

### What Is Still Fuzzy
- semantic tags — I get the concept but want to
  see what happens if I just use divs everywhere

### Small Win Today
Two LeetCode problems accepted in two days.
Did not expect to get Valid Parentheses on first try.
Stack clicked faster than expected.

### Tomorrow
- Learn CSS — box model, colors, fonts
- Style today's basic HTML page and make it look real
- LeetCode problem 3

### Mood
Day 2 felt like things are starting to connect. Not fast — but moving. That is enough.
Each thing takes time and Ready to give it .

### Quote
*"First, solve the problem. Then, write the code."*
---
## Day 1 — April 10, 2026

### What I Did
- Attempted Two Sum on LeetCode for the first time
- Got my code reviewed — had 7 mistakes which is a lot but okay
- Set up GitHub Desktop and figured out how commits work
- Understood the corrected brute force solution properly

### Honest Reflection
Didn't even know where to start with LeetCode today.
Wrote the solution thinking it was correct but turns out
I had silly mistakes like writing num 2 instead of num2
and using = instead of ==  Felt dumb for a second but
these are beginner mistakes everyone makes apparently.

HashMap solution was shown to me but I genuinely did not
understand it at all. Not going to pretend I did.
Will come back to it once I know more.

GitHub setup took more time than expected but feels
satisfying to see my name on a real repo now.

### Things that i will remember for future
- = and == are completely different things. I will never mix these again hopefully.
- Array index goes from 0 to length-1, so always use `i < nums.length` not `i <= n`
- `break` after `return` is unreachable — return already exits the function
- Inner loop should start at `j = i + 1` to avoid pairing same element with itself 
- this is the silliest mistake of today- Variable names cannot have spaces — `num 2` is invalid, it should be `num2`  

### One Thing Still Confusing Me
- Cannot return two values in Java directly — use `return new int[]{i, j}`

### Tomorrow
- Start HTML — semantic tags
- Actually push something to GitHub that is not just a log file

### Mood
Overwhelming start. But finished it. That counts.

### Quote
One Day or Day One, you decide.
so it is my day 1 anf feels much better than one day.