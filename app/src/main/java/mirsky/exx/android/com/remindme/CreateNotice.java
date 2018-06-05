package mirsky.exx.android.com.remindme;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class CreateNotice extends AppCompatActivity {

    Button add;
    Button done;

    ArrayList<Long> noticeTime = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_notice);

        add = findViewById(R.id.addBtn);
        done = findViewById(R.id.doneBtn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNoticeTime((long) R.id.editTime);
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for () {

                }
            }
        });

    }

    private void addNoticeTime(long editTime) {
        noticeTime.add(editTime);
    }

    private void createOneNotice(String noticeName, long noticeTime, int i) {

        NotificationCompat.Builder noticeBuilder =
                new NotificationCompat.Builder(this, "Notify")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(noticeName)
                .setContentText("У вас новое уведомление")
                .setWhen(noticeTime);

        Notification notification = noticeBuilder.build();

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify(i, notification);

    }
}
