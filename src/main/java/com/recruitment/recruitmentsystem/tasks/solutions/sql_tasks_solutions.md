## SQL tasks and solutions
#### 1. Select all rows from POSITIONS table.
SELECT * FROM POSITIONS

#### 2. Select positions from the IT department.
SELECT * FROM POSITIONS WHERE DEPARTMENT = 'IT'

#### 3. Select positions with SALARY_MIN of 8000 or higher.
SELECT * FROM POSITIONS WHERE SALARY_MIN >= 8000

#### 4. Select positions and sort them in descending order by SALARY_MIN.
SELECT * FROM POSITIONS ORDER BY SALARY_MIN DESC

#### 5. Select all rows from APPLICATIONS, replace the ‘CANDIDATE_ID’ column with the candidate’s FIRST_NAME and LAST_NAME, and replace ‘POSITION_ID’ with the job's TITLE. Other columns can be omitted.
SELECT
A.ID,
C.FIRST_NAME,
C.LAST_NAME,
P.TITLE
FROM APPLICATIONS A
LEFT JOIN CANDIDATES C
ON A.CANDIDATE_ID = C.ID
LEFT JOIN POSITIONS P
ON A.POSITION_ID = P.ID

#### 6. Count how many positions each person applied for. Select: FIRST_NAME, LAST_NAME, and the number of applied positions.
SELECT
A.CANDIDATE_ID,
C.FIRST_NAME,
C.LAST_NAME,
COUNT(*)
FROM APPLICATIONS A
LEFT JOIN CANDIDATES C
ON A.CANDIDATE_ID = C.ID
GROUP BY A.CANDIDATE_ID