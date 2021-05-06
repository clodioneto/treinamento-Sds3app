import Footer from "components/Footer";
import NavBar from "components/NavBar";
import Datatable from "components/Datatable";



function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className="container">
        <Datatable></Datatable>
      </div>
      <Footer></Footer>
    </>
  );
}

export default App;
