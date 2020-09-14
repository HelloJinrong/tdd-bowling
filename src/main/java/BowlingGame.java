public class BowlingGame {
    public int countScore(int score[][]){
        int everyScore[]={0,0,0,0,0,0,0,0,0,0};
        int res=0;
        for (int i=0;i<8;i++)
        {
            if(score[i][0]==10){
                everyScore[i]+=score[i][0]+score[i+1][0];
                if(score[i+1][0]==10&&i+1<score.length){
                    everyScore[i]+=score[i+2][0];
                }else everyScore[i]+=score[i+2][1];
            }
            else if(score[i][0]+score[i][1]==10){
                everyScore[i]=score[i][0]+score[i][1]+score[i+1][0];
            }
            else
                everyScore[i]=score[i][0]+score[i][1];
        }

        int count=score[9][0]+score[9][1];

        everyScore[8]=score[8][0]+count;


        if(score[9][0]==10){
            everyScore[9]=count +score[9][2];
        }else if(count==10){
            everyScore[9]=count +score[9][2];
        }else
            everyScore[9]=count;

        for(int i=0;i<10;i++){
            res+=everyScore[i];
        }
        return res;
    }

}
