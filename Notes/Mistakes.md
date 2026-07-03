# Common Mistakes & Learnings

---

# HashMap

## Mistake

Forgot to check containsKey() before updating frequency.

## Learning

Use:

```java
map.put(ch, map.getOrDefault(ch,0)+1);
