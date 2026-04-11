#  My Dev Journey
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