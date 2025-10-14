import os

# Base directory where all problem folders exist
BASE_DIR = "."

# Default README.md template content
README_TEMPLATE = """# {problem_name}

**Difficulty:** (Add difficulty level here)

---

## Problem

(Add the problem statement here.)

---

## Examples

**Example 1**
input:
Output:
Explanation:

---

## Constraints
(Add constraints here.)

---

## Approach (no solution)
- Describe your thought process here.
- Mention possible edge cases.
- Time and space complexity (expected).

---

## Notes
This README intentionally omits any code solution.
"""

# Loop through all folders in base directory
for folder in sorted(os.listdir(BASE_DIR)):
    folder_path = os.path.join(BASE_DIR, folder)
    
    if os.path.isdir(folder_path):
        readme_path = os.path.join(folder_path, "README.md")
        
        # Skip if README.md already exists
        if not os.path.exists(readme_path):
            # Extract clean name for title
            problem_name = folder.replace("-", " ").strip()
            
            # Write README.md
            with open(readme_path, "w", encoding="utf-8") as f:
                f.write(README_TEMPLATE.format(problem_name=problem_name))
            
            print(f"✅ Created README.md for {folder}")
        else:
            print(f"⚠️  Skipped (already exists): {folder}")
