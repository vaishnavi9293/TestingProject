package com.Gmail.TestCases;
//Write your package name

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j {

private static WebDriver driver = null;

public static void main(String[] args) {

// Create a new instance of the Firefox driver
driver = new ChromeDriver();

// Hit the URL for which you want to see logs
driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
// Create reference variable “log” referencing getLogger method of Logger class, it is used to store logs in selenium.txt
Logger log = Logger.getLogger("devpinoyLogger");

// Call debug method with the help of referencing variable log and log the information in test.logs file
log.debug("getting errors");

}

}