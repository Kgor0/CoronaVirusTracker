package io.javabrains.coronavirustracker.controllers;

import io.javabrains.coronavirustracker.CoronaVirusDataService;
import io.javabrains.coronavirustracker.models.LocationStats;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;


@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;


    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatetstTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute(s:"locationStats", allStats);
        model.addAttribute(s:"totalReportedCases", totalReportedCases);
        model.addAttribute(s:"totalNewCases", totalNewCases);

        return "";
    }

 }
