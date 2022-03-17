# ln sass framework

````flow
st=>start: 开始
e=>end: 结束
op=>operation: 操作
cond=>condition: 是或者不是？
subr=>subroutine: 子程序
out=>inputoutput: 输出
st->op->cond
cond(yes)->out->e
cond(no)->subr->op
```

```flow
st=>start: Start
e=>end: End
op1=>operation: My Operation
op2=>operation: Stuff
sub1=>subroutine: My Subroutine
cond=>condition: Yes
or No?
c2=>condition: Good idea
io=>inputoutput: catch something...

st->op1(right)->cond
cond(yes, right)->c2
cond(no)->sub1(left)->op1
c2(yes)->io->e
c2(no)->op2->e
````

