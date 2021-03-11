/*
1、查询出成绩表(student)每门课都大于60分的学生姓名.
name	course	score
*/

-- 解法1：not in
select distinct name from student where name not in (select distinct name from student where score<=60);

-- 解法2：having
select name from student group by name having MIN(score)>60;


/*
2、学生表三列，姓名、课程、成绩，查询出所有学生的总成绩，并从高到低排序
 */
select name,SUM(score) as totalscore from student group by name order by totalscore desc;


/*
3、学生表：

自动编号  姓名   性别  分数  科目

1                刘萌萌         80    英语

2                张亮             66    数学

3                张亮             66    数学
删除除了自动编号不同, 其他都相同的学生冗余信息
 */
delete from stu where id not in (select MIN(id) from stu group by name,sex,score,subject);


/*
4、选择表city 表中id重复的记录
 */
select * from city where id in (select id from city group by id having count(*)>1);


/*
5、有一个 employees 表 包含：dept_id(部门id)、job_cat（工种）、salary（工资）；用SQL语句描述每一个部门的每个工种的工资最大值。
 */
select dept_id,job_cat,MAX(salary) from employees group by dept_id,job_cat;