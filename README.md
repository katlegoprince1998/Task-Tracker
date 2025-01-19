# Task-Tracker  

 # Challange from: # [Task Tracker CLI Project](https://roadmap.sh/projects/task-tracker)

# Requirements

The application should run from the command line, accept user actions and inputs as arguments, and store the tasks in a JSON file. The user should be able to:

- **Add**, **Update**, and **Delete** tasks
- Mark a task as **in progress** or **done**
- List all tasks:
  - **All tasks**
  - **Tasks that are done**
  - **Tasks that are not done**
  - **Tasks that are in progress**

---

## Constraints

- You can use **any programming language** to build this project.
- Use **positional arguments** in the command line to accept user inputs.
- Store the tasks in a **JSON file** in the current directory.
  - The JSON file should be created if it does not exist.
- Use the **native file system module** of your programming language to interact with the JSON file.
- Do **not use any external libraries or frameworks** to build this project.
- Ensure to handle **errors** and **edge cases** gracefully.

# Task Properties

Each task should have the following properties:

- **id**: A unique identifier for the task.
- **description**: A short description of the task.
- **status**: The status of the task (`todo`, `in-progress`, `done`).
- **createdAt**: The date and time when the task was created.
- **updatedAt**: The date and time when the task was last updated.

These properties should be stored in the JSON file when adding a new task and updated when a task is modified.

---

# Getting Started

## 1. Set Up Your Development Environment
- Choose a programming language you are comfortable with (e.g., Python, JavaScript, etc.).
- Ensure you have a code editor or IDE installed (e.g., VSCode, PyCharm).

## 2. Project Initialization
- Create a new project directory for your **Task Tracker CLI**.
- Initialize a version control system (e.g., **Git**) to manage your project.

## 3. Implementing Features
- Start by creating a basic **CLI structure** to handle user inputs.
- Implement each feature one at a time:
  1. **Add a task**: Store all required task properties in the JSON file.
  2. **List tasks**: Display tasks based on the required filters (all, done, not done, in progress).
  3. **Update tasks**: Modify task details and update `updatedAt`.
  4. **Mark tasks**: Update the task's status (e.g., mark as done or in progress).
  5. **Delete tasks**: Remove tasks by their `id`.

## 4. Testing and Debugging
- Test each feature individually to ensure it works as expected.
- Check the JSON file to verify the correct storage and updates of tasks.
- Debug any issues that arise during development.

---

# Suggested Workflow
1. **Set up your JSON file**: Ensure it initializes correctly when the project runs for the first time.
2. **Build and test incrementally**: Start with simple functionalities and test them thoroughly.
3. **Handle edge cases**: Plan for scenarios such as:
   - Invalid or missing inputs.
   - File read/write errors.
   - Nonexistent task IDs during updates or deletions.

With these steps, you'll have a robust **Task Tracker CLI** project ready to manage tasks efficiently.
