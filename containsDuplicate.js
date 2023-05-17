function containsDuplicate(nums) {
    const set = new Set();
    for (let i = 0; i < nums.length; i++) {
        if (set.has(nums[i])) {
            return true;
        }
        set.add(nums[i]);
    }
    return false;
}

const nums = [1, 2, 3, 4];
console.log(containsDuplicate(nums));  // This should print "true"