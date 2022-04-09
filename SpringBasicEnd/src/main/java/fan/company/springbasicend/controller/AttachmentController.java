package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Attachment;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/uploadFileToFileSystem")
    public Result uploadFileToFileSystem(MultipartHttpServletRequest request) throws IOException {
        return attachmentService.uploadFileToFileSystem(request);
    }

    @GetMapping("/downloadFileFromFileSystem/{id}")
    public Result downloadFileFromFileSystem (@PathVariable Long id, HttpServletResponse response){
        return attachmentService.downloadFromFileSystem(id, response);
    }

    @GetMapping("/info")
    public List<Attachment> getAllPhotos(){
        return attachmentService.getAllPhotos();
    }

    @GetMapping("/info/{id}")
    public Attachment getByIdPhoto(@PathVariable Long id){
        return attachmentService.getByIDPhoto(id);
    }












}
