int main(){
    printf("Enter The Speed of the Wind");
    int wind;
    scanf("%d",&wind);
    if(wind<25)
        printf("Not a Strong Wind");
    if(wind>=25 && wind<=38)
        printf("String Wind");
    if(wind>=39 && wind<=54)
        printf("gale");
    if(wind>=55 && wind<=72)
        printf("whole gale");
    if(wind>72)
        printf("Hurricane");
    if(wind<0)
        printf("Inavlid Input");
    return 0;
}