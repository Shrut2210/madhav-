#include<stdio.h>
int main()
{
    int y,w;
    scanf("%d %d", &y, &w);

    int max = (y>w)?y:w;

    int d = (7-max);
    printf("%.0f",((d/6)*2),"/2");
}