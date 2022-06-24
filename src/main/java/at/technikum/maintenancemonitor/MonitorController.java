package at.technikum.maintenancemonitor;


import org.springframework.web.bind.annotation.*;

    @CrossOrigin
    @RestController
    @RequestMapping("/api/monitoring")
    public class MonitorController {
        String stat = "-";

        @GetMapping()
        public String getStatus(){
            return stat;
        }

        @GetMapping("{stat}")
        public String setStatus(@PathVariable("stat") String set){
            if (set == null || set.isEmpty()){
                return stat;
            }
            else {
                stat = set;
                return stat;
            }
        }
    }


