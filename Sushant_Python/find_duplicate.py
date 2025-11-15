import sys
def fastslow(a):
    ans=0
    slow=a[0]
    fast=a[0]
    while True:
        slow=a[slow]
        fast=a[a[fast]]
        if slow==fast:
            break;
    fast=a[0];
    while slow!=fast:
        slow=a[slow]
        fast=a[fast]

    return slow;



if __name__ == '__main__':
    a=[1,5,7,2,3,4,1,6]
    sum=sum(a)
    print(sum)

    for i in range(len(a)):
        if i+1==a[i]:
            continue

        if a[i]==a[a[i]-1]:
            print(a[i])

    value=a[i]-1
    a[i],a[value]=a[value],a[i]

   # print(fastslow(a))
# //we can do fast pointer slowpointer as well