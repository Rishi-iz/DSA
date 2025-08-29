# **# Intuition**

<!-- Describe your first thoughts on how to solve this problem. -->

- The array is already sorted.
- That means all duplicates will be grouped together.
- So if we scan the array from left to right:
- Whenever we see a new number different from the previous one, that’s a unique element.
- We just need to keep track of where the next unique element should go.

**# 👉 Using two pointers:**

One pointer (i) keeps track of the position of the last unique element.

Another pointer (j) scans through the array.

Each time we find a new unique number, we "extend" the unique section by writing it at nums[i+1].

This way:

All unique elements are moved to the front.

Duplicates are skipped automatically.

No extra space is needed.

# **# Approach**

<!-- Describe your approach to solving the problem. -->

**# Two Pointers**

Idea:

Since the array is already sorted, duplicates will always be adjacent.

We maintain two pointers:

i → the index of the last unique element found so far.

j → the index scanning through the array.

Steps:

Start with i = 0.

Iterate j from 1 to n-1.

If nums[j] != nums[i] → we found a new unique element:

Increment i.

Place this unique element at nums[i] = nums[j].

Otherwise, if they are equal → skip it (since it’s a duplicate).

Return:

After the loop ends, the number of unique elements is i + 1.

The first i+1 elements of nums are unique and sorted.

### 2. **What mistake did i make ?**

- CONFUSED in the index marking , comparing and replacing the elements

### 3. **What can I do next time to make sure I don't make the same mistakes again?**

- 

## DRY RUN

We’ll use this example:

```
nums = [1,1,2,2,3]

```

---

### Initial setup

- `i = 0` (last unique element position)
- `j = 1` (scanning pointer)
- Array = `[1,1,2,2,3]`

---

### Step 1 → `j = 1`

- Compare `nums[i] = nums[0] = 1` with `nums[j] = nums[1] = 1`
- They are equal → duplicate → skip
- `i = 0`
- Array unchanged: `[1,1,2,2,3]`

---

### Step 2 → `j = 2`

- Compare `nums[i] = nums[0] = 1` with `nums[j] = nums[2] = 2`
- Different → found new unique element
- Increment `i = 1`
- Copy `nums[j]` to `nums[i]` → `nums[1] = 2`
- Array becomes: `[1,2,2,2,3]`

---

### Step 3 → `j = 3`

- Compare `nums[i] = nums[1] = 2` with `nums[j] = nums[3] = 2`
- They are equal → duplicate → skip
- `i = 1`
- Array unchanged: `[1,2,2,2,3]`

---

### Step 4 → `j = 4`

- Compare `nums[i] = nums[1] = 2` with `nums[j] = nums[4] = 3`
- Different → found new unique element
- Increment `i = 2`
- Copy `nums[j]` to `nums[i]` → `nums[2] = 3`
- Array becomes: `[1,2,3,2,3]`

---

### End of loop

- Final `i = 2`
- Answer = `i + 1 = 3` (number of unique elements)

---

✅ Result:

- Unique portion of array = `[1,2,3]`
- Return value = `3`
