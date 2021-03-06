package com.example.backend.controllers.misc;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Logger;

/**
 * Created by Andreyko0 on 29/01/2018.
 */
@RestController
@RequestMapping("/log")
public class AndroidLoggerController {
  @PostMapping("/")
  public void log(@RequestBody String log) throws Exception {
      System.out.println("Android: " + log);
  }
}
