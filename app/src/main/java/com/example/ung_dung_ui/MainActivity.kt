package com.example.ung_dung_ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lấy nút chỉnh sửa bằng ID
        val editButton: ImageView = findViewById(R.id.edit_button)

        // Thêm sự kiện click vào nút chỉnh sửa
        editButton.setOnClickListener {
            Toast.makeText(this, "Edit button clicked!", Toast.LENGTH_SHORT).show()
            // Có thể mở một Activity khác hoặc hiển thị hộp thoại chỉnh sửa ở đây
        }
    }
}

