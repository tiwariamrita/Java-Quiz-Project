import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SpageFormComponent } from './spage-form.component';

describe('SpageFormComponent', () => {
  let component: SpageFormComponent;
  let fixture: ComponentFixture<SpageFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SpageFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SpageFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
