import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SloginFormComponent } from './slogin-form.component';

describe('SloginFormComponent', () => {
  let component: SloginFormComponent;
  let fixture: ComponentFixture<SloginFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SloginFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SloginFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
