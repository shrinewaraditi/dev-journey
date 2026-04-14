# HTML — Everything Explained Like You're 5

---

#  The HTML Skeleton — Every Word Explained

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Name — Portfolio</title>
  </head>
  <body>

  </body>
</html>
```

Let's go word by word.

---

## `<!DOCTYPE html>`

**What it is:**
This is not an HTML tag. It is an instruction to the browser.

**Simple explanation:**
Imagine you receive a letter. Before reading it you need to know — is this written in English or French? `<!DOCTYPE html>` tells the browser:
> "Hey browser, what follows is written in modern HTML5. Read it accordingly."

**What happens if you remove it:**
Browser goes into "guessing mode" — it tries to figure out what version of HTML you're using. Sometimes it guesses wrong and your page looks broken.

**Rule:** Always write this as the very first line. Every single HTML file. No exceptions.

---

## `<html lang="en">`

**What it is:**
This is the root tag — the grandparent of every single thing on your page. Everything lives inside this tag.

**Simple explanation:**
Think of your HTML file as a house. `<html>` is the plot of land the house sits on. Everything — walls, rooms, furniture — goes inside it.

**What is `lang="en"`:**
This tells the browser "the language of this page is English." This helps:
- Screen readers (for blind users) know which language to read in
- Google understand what language your page is
- Browser spell check work correctly

If you make a Hindi page you'd write `lang="hi"`. For now always keep `lang="en"`.

---

## `<head>`

**What it is:**
The invisible section of your page. Nothing inside `<head>` appears on screen.

**Simple explanation:**
Think of a movie. Before the movie starts there's a clapper board with:
- Movie name
- Director name
- Scene number

The audience never sees the clapper board — but it contains important information. `<head>` is your clapper board.

It contains:
- Page title (shown on browser tab)
- Links to CSS files
- Meta information
- Links to fonts

---

## `<meta charset="UTF-8">`

**What is charset:**
Charset = Character Set = the collection of characters your page can display.

**Simple explanation:**
Imagine you have a typewriter. If it only has English keys, you can't type Hindi or Chinese characters. `charset="UTF-8"` gives your page a typewriter that supports **every character in every language in the world** — including emojis 🎉

**What happens without it:**
Special characters look broken. Instead of `é` you might see `Ã©`. Instead of `₹` you might see garbage.

**Rule:** Always include this. Always.

---

## `<meta name="viewport" content="width=device-width, initial-scale=1.0">`

This one looks scary. Let's break it into pieces.

**What is viewport:**
The viewport is the visible area of the browser window on your screen.

**Simple explanation:**
Imagine you built a paper map that is 1 meter wide. Now you try to look at it through a small window that's only 30cm wide. You'd only see part of the map.

Old phones had this problem — websites built for desktop were too wide. The phone would zoom out and show a tiny unreadable version.

This meta tag says:
- `width=device-width` → make the page width equal to the device screen width
- `initial-scale=1.0` → don't zoom in or out when page first loads

**In simple words:** This one line makes your page not look broken on mobile phones.

**Rule:** Always include this. Every page.

---

## `<title>Your Name — Portfolio</title>`

**What it is:**
The text that appears on the browser tab.

**Simple explanation:**
Open Chrome right now. Look at the tab at the top. It says something like "Google" or "YouTube". That text comes from the `<title>` tag.

It also appears:
- When you bookmark a page
- In Google search results as the blue clickable heading
- When you share a link on WhatsApp

**Rule:** Always make it descriptive. "Page" is bad. "Rahul Sharma — Web Developer" is good.

---

## `<body>`

**What it is:**
Everything the user actually SEES on the page goes inside body.

**Simple explanation:**
If `<head>` is the behind-the-scenes crew of a movie, `<body>` is everything the audience sees on screen — actors, sets, costumes, everything.

Text, images, buttons, forms, videos — all of it goes inside `<body>`.

---

## Opening and Closing Tags — Why Both?

```html
<h1>Hello</h1>
↑              ↑
opening      closing
tag           tag
```

**Simple explanation:**
Think of tags like brackets in math:
- `(3 + 4)` — you open a bracket and must close it
- `<h1>Hello</h1>` — you open a tag and must close it

The closing tag has a `/` before the name. It tells the browser "this element ends here."

Some tags don't need closing because they don't wrap content:
```html
<meta charset="UTF-8">   ← no closing needed, just gives info
<img src="photo.jpg">    ← no closing needed, just shows image
<br>                     ← no closing needed, just a line break
```

---

# 🏷️ Semantic vs Non-Semantic Tags

This is one of the most important concepts in HTML.

---

## Non-Semantic Tags — The Dumb Boxes

```html
<div>   → a block level box
<span>  → an inline box
```

**What "non-semantic" means:**
These tags have **no meaning**. They're just containers. They tell the browser absolutely nothing about what's inside them.

**Simple explanation:**
Imagine you have boxes for moving house. You put random things in random boxes and label every single box just "BOX." When you arrive at your new house, you have no idea which box has kitchen items, which has clothes, which has books.

`<div>` and `<span>` are like boxes labeled "BOX." They contain things but tell you nothing about what.

```html
<div>I could be anything</div>
<div>A navbar? A footer? Who knows</div>
<div>The browser has no idea what I am</div>
```

---

## Semantic Tags — The Smart Boxes

```html
<header>   → this is the top/header area
<nav>      → this contains navigation links
<main>     → this is the main content
<section>  → this is a section of content
<article>  → this is a standalone piece like a blog post
<footer>   → this is the bottom/footer area
<aside>    → this is sidebar content
```

**What "semantic" means:**
These tags TELL YOU what they contain. They have meaning built into the name.

**Simple explanation:**
Now imagine your moving boxes are labeled properly:
- "KITCHEN — plates and cups"
- "BEDROOM — clothes"
- "STUDY — books"

`<header>`, `<footer>`, `<nav>` are like properly labeled boxes. Everyone — you, your teammate, the browser, Google — immediately knows what's inside.

---

## Why Does It Matter? 3 Real Reasons

**Reason 1 — Google understands your page better**
```html
<!-- Google sees this and thinks: navigation links -->
<nav>
  <a href="/about">About</a>
</nav>

<!-- Google sees this and thinks: no idea what this is -->
<div>
  <a href="/about">About</a>
</div>
```
Semantic tags help your page rank better on Google.

**Reason 2 — Screen readers work correctly**
Blind users use software that reads pages out loud. When it hits `<nav>` it announces "navigation." When it hits `<div>` it has no idea what to say.

**Reason 3 — Your code is readable**
```html
<!-- Which is easier to understand? -->

<!-- Option A: semantic -->
<header>...</header>
<nav>...</nav>
<main>...</main>
<footer>...</footer>

<!-- Option B: non-semantic -->
<div>...</div>
<div>...</div>
<div>...</div>
<div>...</div>
```
Option A tells you the structure instantly. Option B tells you nothing.

---

# 🔍 `<nav>` — Explained Fully

**What it is:**
A semantic tag specifically for navigation links — the menu of your website.

**Where to use it:**
- Main menu at top of page
- Sidebar menu
- Footer links menu

**Where NOT to use it:**
- Random links inside a paragraph
- Social media icons at bottom (use `<footer>` for those)

**How it looks:**
```html
<nav>
  <a href="#about">About</a>
  <a href="#skills">Skills</a>
  <a href="#projects">Projects</a>
  <a href="#contact">Contact</a>
</nav>
```

**Simple explanation:**
Every website has a menu — Home, About, Contact etc. `<nav>` is the official box that holds that menu. It tells everyone "these are the navigation links of this website."

**Real world example:**
Go to any website — Flipkart, GitHub, anywhere. The top bar with links? That entire thing sits inside a `<nav>` tag.

---

# 📦 `<div>` — Explained Fully

**What it is:**
A generic block-level container with no meaning. Just a box.

**What "block-level" means:**
A `<div>` always starts on a new line and takes up the full width available — like a brick in a wall.

```
|←————— full width ————————→|
|          <div>             |
|←————— full width ————————→|
|          <div>             |
```

**When to use `<div>`:**
Use it when no semantic tag fits — when you just need a box for layout or styling purposes.

```html
<!-- You need to wrap 3 cards in a row — no semantic tag fits this -->
<div class="cards-container">
  <div class="card">Card 1</div>
  <div class="card">Card 2</div>
  <div class="card">Card 3</div>
</div>
```

**Simple explanation:**
`<div>` is like a transparent plastic bag. It has no label, no meaning — it just groups things together so you can style them or move them around as one unit.

**Common mistake beginners make:**
```html
<!-- ❌ Wrong — using div when semantic tag exists -->
<div id="header">...</div>
<div id="navigation">...</div>
<div id="footer">...</div>

<!-- ✅ Right — use semantic tags -->
<header>...</header>
<nav>...</nav>
<footer>...</footer>
```

Only use `<div>` when no semantic tag makes sense.

---

# 🔤 `<span>` — Explained Fully

**What it is:**
A generic inline container with no meaning. Like `<div>` but for text.

**What "inline" means:**
`<span>` does NOT start on a new line. It sits inside text, wrapping just a part of it.

```
This is a sentence with <span>highlighted words</span> inside it.
```
The span wraps only those specific words — everything stays on the same line.

**div vs span — the core difference:**
```html
<!-- div = block, takes full line -->
<div>I am on my own line</div>
<div>I push everything below me</div>

<!-- span = inline, stays inside text -->
<p>My name is <span>Rahul</span> and I am a developer</p>
```

**When to use `<span>`:**
When you want to style a specific word or part of text differently:

```html
<p>
  My CGPA is <span style="color: green; font-weight: bold;">8.5</span> out of 10
</p>

<p>
  Price: <span style="color: red;">₹999</span> only
</p>
```

**Simple explanation:**
Imagine a sentence written on paper. `<div>` is like taking a whole new sheet of paper. `<span>` is like using a highlighter on just one word of the existing sentence — everything stays in place, you just mark a part of it.

---

## `<div>` vs `<span>` — Side by Side

| | `<div>` | `<span>` |
|--|---------|---------|
| Type | Block level | Inline |
| New line? | Yes, always | No, stays in text |
| Used for | Grouping sections | Styling part of text |
| Default width | Full width | Only as wide as content |
| Example use | Card container, layout box | Highlight a word, color one number |

---

# 🖥️ How to Open File With Live Server — Step by Step

**What is Live Server:**
A VS Code extension that opens your HTML file in the browser AND automatically refreshes it every time you save. So you save → browser updates instantly. No manual refresh.

---

**Step 1 — Install VS Code**
- Go to **code.visualstudio.com**
- Click Download for Windows
- Install it with all default settings
- Open VS Code

---

**Step 2 — Install Live Server Extension**
- Look at the left sidebar in VS Code
- Click the icon that looks like 4 squares (Extensions)
- In the search box type: `Live Server`
- You'll see "Live Server" by Ritwick Dey
- Click the blue **Install** button
- Wait 10 seconds — done

---

**Step 3 — Open Your Project Folder**
- In VS Code click **File → Open Folder**
- Navigate to your `dev-journey` folder
- Click **Select Folder**
- Now your left sidebar shows all your files and folders

---

**Step 4 — Open Your HTML File**
- In left sidebar click `HTML-CSS` folder
- Click `index.html`
- The file opens in the editor

---

**Step 5 — Start Live Server (2 ways)**

**Way 1 — Right click method:**
- Right click anywhere inside the HTML file
- Click **"Open with Live Server"**

**Way 2 — Bottom bar method:**
- Look at the very bottom of VS Code
- You'll see **"Go Live"** text at bottom right
- Click it

---

**Step 6 — See your page**
- Browser opens automatically
- URL will be something like `http://127.0.0.1:5500/HTML-CSS/index.html`
- Your HTML page is visible

---

**Step 7 — Test that it's live**
- Go back to VS Code
- Change your `<h1>` text to anything
- Press **Ctrl+S** to save
- Look at browser — it updated automatically ✅

---

**Step 8 — Stop Live Server**
- Bottom bar shows a port number like **"Port: 5500"**
- Click it to stop the server
- Or just close VS Code

---

## What `http://127.0.0.1:5500` Means

```
http://          → the protocol, how data travels
127.0.0.1        → your own computer's address (localhost)
                   means "talk to myself, not the internet"
:5500            → the port, like a door number on your computer
```

**Simple explanation:**
Your computer is like an apartment building. `127.0.0.1` is the building address — your own building. `:5500` is the flat number. Live Server opens a tiny local website at flat 5500 in your own building. Only you can see it — it's not on the real internet yet.

---

## Full Picture — How Everything Connects

```
Your HTML file (index.html)
        ↓
   VS Code opens it
        ↓
   Live Server runs it
        ↓
   Browser shows it at 127.0.0.1:5500
        ↓
   You edit in VS Code → Ctrl+S
        ↓
   Browser auto-refreshes
```
### Resources
"Sheryians HTML crash course"
---
# HTML Quick Notes (Basic to Interview Ready)

## ✅ What I Know
- Basic HTML structure (`<!DOCTYPE>`, `<html>`, `<head>`, `<body>`)
- Headings (`h1` to `h6`)
- Paragraph (`p`)
- Basic formatting (`b`, `i`)
- Lists (`ul`, `ol`)

---

## ❌ Mistakes to Avoid

### 1. Always Close Tags
Wrong:
```
<li>Item
```
Correct:
```
<li>Item</li>
```

---

### 2. Use Correct Link Tag
Wrong:
```
<link a href="...">
```
Correct:
```
<a href="https://example.com">Click here</a>
```

---

### 3. Use Meaningful Title
```
<title>My First Test Page</title>
```

---

## 📌 Important Tags (Must Know)

### 🔹 Link
```
<a href="https://google.com">Google</a>
```

### 🔹 Image
```
<img src="image.jpg" alt="description">
```

---

## 📊 Tables (Important for Interview)
```
<table border="1">
  <tr>
    <th>Name</th>
    <th>Age</th>
    <th>City</th>
  </tr>
  <tr>
    <td>Aditi</td>
    <td>21</td>
    <td>Pune</td>
  </tr>
</table>
```

---

## 📝 Forms (VERY IMPORTANT)

```
<form>
  Name: <input type="text"><br>
  Email: <input type="email"><br>

  Gender:
  <input type="radio" name="gender"> Male
  <input type="radio" name="gender"> Female

  Skills:
  <input type="checkbox"> HTML
  <input type="checkbox"> CSS

  <br><br>
  <input type="submit" value="Submit">
</form>
```

---

## 🧱 Semantic Tags (Modern HTML)

- `<header>` → Top section
- `<section>` → Content block
- `<footer>` → Bottom section

Example:
```
<header>My Website</header>

<section>
  <h2>About Me</h2>
</section>

<footer>Made by Aditi</footer>
```

---

## ⚡ Best Practices

- Use `<strong>` instead of `<b>`
- Use `<em>` instead of `<i>`
- Always indent code properly
- Always close tags
- Use meaningful names

---

## 🎯 Goal

I can say "I know HTML" when I can:
- Create full page structure
- Add links, images
- Create tables
- Build forms
- Use semantic tags correctly
### underline
better way - <span style="text-decoration: underline;">This text is underlined</span>
simple- <u>This text is underlined</u>