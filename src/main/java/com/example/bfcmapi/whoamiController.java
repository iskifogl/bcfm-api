package com.example.bfcmapi;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;
import java.io.*;

@RestController
public class whoamiController {

    // private static final String template = "Hello, %s!";

    @GetMapping("/whoami")
    public whoami whoami(@RequestParam(value = "firstname", defaultValue = "firstname") String name, @RequestParam(value = "lastname", defaultValue = "lastname") String lastname) {
        return new whoami(name,lastname);
    }

   /* @PostMapping("/alert")
    public whoami whoami(@RequestParam(value = "name", defaultValue = "firstname") String name, @RequestParam(value = "lastname", defaultValue = "lastname") String lastname) {
        return new whoami(name,lastname);
    } */

}
