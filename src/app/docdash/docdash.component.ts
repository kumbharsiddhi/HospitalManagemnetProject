import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';


@Component({
  selector: 'app-docdash',
  templateUrl: './docdash.component.html', 
  styleUrls: ['./docdash.component.css']
})
export class DocdashComponent implements OnInit {
  searchText: string;
  patients: Patient[]; 

  constructor(private patientService: PatientService,
    private router: Router) { }

  ngOnInit(): void {
    this.getPatients();
    
  }

  private getPatients(){
    this.patientService.getPatientlist().subscribe(data => { this.patient = data; 
    });
  }


  }

}
