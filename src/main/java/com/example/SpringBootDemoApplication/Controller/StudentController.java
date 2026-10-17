package com.example.SpringBootDemoApplication.Controller;

import com.example.SpringBootDemoApplication.entity.Student;
import com.example.SpringBootDemoApplication.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student)
    {
        Student createdStudent = studentService.createStudent(student);

        return ResponseEntity.ok(createdStudent);
    }

//    @GetMapping("/get/{id}")
//    public ResponseEntity<Student> getstudent(@PathVariable Long id)

    @GetMapping("/get")
    public ResponseEntity<Student> getstudent(@RequestParam Long id)
    {
        Student studentResp = studentService.getStudent(id);

        if (studentResp == null)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentResp);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent()
    {
        List <Student> studentList = studentService.getAllStudent();

        if(studentList.isEmpty())
        {
            return null;
        }
        return ResponseEntity.ok(studentList);
    }

//    @PutMapping("/update/{id}")
//    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentReq)

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestParam Long id, @RequestBody Student studentReq)
    {
        Student updatedStudent = studentService.updateStudent(id, studentReq);

        if (updatedStudent == null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedStudent);
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<String> deleteStudent(@PathVariable Long id)

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudent(@RequestParam Long id)
    {
        Boolean isDeleted = studentService.deleteStudent(id);

        if(!isDeleted)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record Deleted");
    }

    @PatchMapping("/soft-delete")
    public ResponseEntity<String> deleteSoftly(@RequestParam Long id)
    {
        Boolean isDeleted = studentService.deleteSoftly(id);

        if (!isDeleted)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Record Deleted");
    }
}
