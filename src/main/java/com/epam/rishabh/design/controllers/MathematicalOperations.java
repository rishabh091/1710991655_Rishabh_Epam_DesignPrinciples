package com.epam.rishabh.design.controllers;

import com.epam.rishabh.design.domain.Operation;
import com.epam.rishabh.design.services.DoOperation;
import com.epam.rishabh.design.services.InvalidOperationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(path = "/operate")
public class MathematicalOperations {

    @Autowired
    DoOperation doOperation;

    @PostMapping(path = "/doOperation",consumes = "application/json")
    public float operation(@RequestBody Operation operation) throws InvalidOperationException {
        System.out.println("Request : "+operation.toString());
        return doOperation.operationDone(operation.getDigit1(), operation.getDigit2(), operation.getOperand());
    }
}
